package com.SystemDesign.LLD.questions.RateLimitter.RateLimiterStrategy;

import com.SystemDesign.LLD.questions.RateLimitter.FixedWindow;
import com.SystemDesign.LLD.questions.RateLimitter.config.FixedWindowConfig;

import java.time.Duration;
import java.time.Instant;
import java.util.Map;
import java.util.Objects;

public class FixedWindowStrategy implements RateLimiterStrategy{

   private FixedWindowConfig fixedWindowConfig;
   private Map<String, FixedWindow> windows;

   public FixedWindowStrategy(FixedWindowConfig fixedWindowConfig,Map<String, FixedWindow> windows){
       this.fixedWindowConfig=fixedWindowConfig;
       this.windows=windows;
   }

    @Override
    public boolean isAllowed(String key) {
        Instant now=Instant.now();

        FixedWindow window=windows.get(key);
        if(Objects.isNull(window)){
            window=new FixedWindow(1,now);
            windows.put(key, window);
            return true;
        }
        else{
            Duration timeElapsed=Duration.between(window.windowStartTime(),now);
            if(timeElapsed.compareTo(fixedWindowConfig.windowSize())>=0){
                window=new FixedWindow(1,now);
                windows.put(key,window);
                return true;
            }
            else if( fixedWindowConfig.maxRequest()<=window.noOfRequest()){
                return false;
            }
        }

       FixedWindow updatedWindow=new FixedWindow(window.noOfRequest()+1, window.windowStartTime());
        windows.put(key,updatedWindow);
        return true;

    }
}

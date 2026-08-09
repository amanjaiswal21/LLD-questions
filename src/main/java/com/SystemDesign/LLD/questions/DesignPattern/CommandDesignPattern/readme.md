# Command Design Pattern - Quick Revision

Command Design Pattern is a **behavioral design pattern** that converts a request/action into a separate object.  
It is mainly used to **decouple the sender (Invoker) from the actual worker (Receiver)**.  
The Invoker only calls `command.execute()` and doesn't need to know how the action is performed.  
It makes it easy to add new commands without changing existing Invoker code and also supports features like **Undo, Redo, Logging, Queueing, and History**.  
Example: `RemoteController → Command → TVOnCommand → TV`.
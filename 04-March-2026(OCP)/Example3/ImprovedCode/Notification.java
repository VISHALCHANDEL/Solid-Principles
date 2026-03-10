package ImprovedCode;

public interface Notification {
    void sendMessage(String message);
}

// We should try to think that if further alterations in the requriments can unnecssarily impact code of a class, it is violating ocp.

// Instead of being tightly coupled with the notification, we now depend on notification interface.

//Even if we introduce new tyype of notifications or remove any older one, then sender class is not impacted.  

// It is a good idea to depend on abstraction rather than concrete classes.

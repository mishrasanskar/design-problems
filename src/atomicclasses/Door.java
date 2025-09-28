package atomicclasses;

/*
Problem:
You are building a smart home system. A door can be locked/unlocked using multiple threads (e.g., family members’ apps).
Implement a thread-safe lock/unlock system using AtomicBoolean to prevent race conditions.
**/

import java.util.concurrent.atomic.AtomicBoolean;

class DoorLock{

    private AtomicBoolean doorLock = new AtomicBoolean(false);

    public boolean isLocked() {
        return doorLock.get();
    }
    public boolean lock(){
        return doorLock.compareAndSet(false, true);
    }

    public boolean unlock(){
        return doorLock.compareAndSet(true, false);
    }
}

public class Door {

    public static void main(String[] args) {
        DoorLock doorLock = new DoorLock();

        System.out.println("Current state of door is " + (doorLock.isLocked() ? "locked" : "not locked"));
        doorLock.lock();
        System.out.println("Current state of door is " + (doorLock.isLocked() ? "locked" : "not locked"));
        doorLock.unlock();
        System.out.println("Current state of door is " + (doorLock.isLocked() ? "locked" : "not locked"));


    }

}

package com.forestvue.repository;

import org.springframework.stereotype.Repository;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Repository
public class Well {
    private int data = 10000;
    private Lock lock;
    Well(){
        lock = new ReentrantLock();
    }
    public void remove(int amount){
        this.lock.lock();
        data -= amount;
        this.lock.unlock();
    }
    public void add(int amount){
        this.lock.lock();
        data += amount;
        this.lock.unlock();
    }
    public int getWell(){
        return data;
    }
}

package edu.wctc.coachdemo.v8;

/**
 * Dependency interface class
 */
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "You will meet a new friend";
    }
}

package org.loadtest4j.examples.java.driver;

import org.loadtest4j.driver.DriverResponseTime;

import java.time.Duration;

class DummyResponseTime implements DriverResponseTime {
    @Override
    public Duration getPercentile(double i) {
        return Duration.ZERO;
    }
}

package org.graylog.plugins.sample.alerts;

import org.graylog2.plugin.alarms.AlertCondition;
import org.graylog2.plugin.alarms.callbacks.AlarmCallback;
import org.graylog2.plugin.alarms.callbacks.AlarmCallbackConfigurationException;
import org.graylog2.plugin.alarms.callbacks.AlarmCallbackException;
import org.graylog2.plugin.configuration.Configuration;
import org.graylog2.plugin.configuration.ConfigurationException;
import org.graylog2.plugin.configuration.ConfigurationRequest;
import org.graylog2.plugin.streams.Stream;

import java.util.Map;

public class SampleAlertNotification implements AlarmCallback {

    private Configuration config;

    @Override
    public void initialize(Configuration config) throws AlarmCallbackConfigurationException {
        this.config = config;
    }

    @Override
    public void call(Stream stream, AlertCondition.CheckResult result) throws AlarmCallbackException {

    }

    @Override
    public ConfigurationRequest getRequestedConfiguration() {
        return new ConfigurationRequest();
    }

    @Override
    public String getName() {
        return "Sample Alert Notification";
    }

    @Override
    public Map<String, Object> getAttributes() {
        return config.getSource();
    }

    @Override
    public void checkConfiguration() throws ConfigurationException {

    }
}

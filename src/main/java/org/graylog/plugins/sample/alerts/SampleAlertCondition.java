package org.graylog.plugins.sample.alerts;

import com.google.inject.assistedinject.Assisted;

import org.graylog2.alerts.AbstractAlertCondition;
import org.graylog2.plugin.alarms.AlertCondition;
import org.graylog2.plugin.configuration.ConfigurationRequest;
import org.graylog2.plugin.streams.Stream;
import org.joda.time.DateTime;

import java.util.Map;

import javax.annotation.Nullable;
import javax.inject.Inject;

public class SampleAlertCondition extends AbstractAlertCondition {

    @Inject
    public SampleAlertCondition(@Assisted Stream stream,
                                @Nullable @Assisted("id") String id,
                                @Assisted DateTime createdAt,
                                @Assisted("userid") String creatorUserId,
                                @Assisted Map<String, Object> parameters,
                                @Assisted("title") @Nullable String title) {
        super(stream, id, SampleAlertCondition.class.getCanonicalName(), createdAt, creatorUserId, parameters, title);
    }

    @Override
    public String getDescription() {
        return "matches nothing";
    }

    @Override
    public CheckResult runCheck() {
        return new AbstractAlertCondition.NegativeCheckResult();
    }

    public interface Factory extends AlertCondition.Factory {
        SampleAlertCondition create(@Assisted Stream stream,
                                    @Assisted("id") String id,
                                    @Assisted DateTime createdAt,
                                    @Assisted("userid") String creatorUserId,
                                    @Assisted Map<String, Object> parameters,
                                    @Assisted("title") @Nullable String title);

        SampleAlertCondition.Config config();

        SampleAlertCondition.Descriptor descriptor();
    }

    public static class Config implements AlertCondition.Config {
        public Config() {
        }

        @Override
        public ConfigurationRequest getRequestedConfiguration() {
            final ConfigurationRequest configurationRequest = ConfigurationRequest.createWithFields();
            configurationRequest.addFields(AbstractAlertCondition.getDefaultConfigurationFields());

            return configurationRequest;
        }
    }

    public static class Descriptor extends AlertCondition.Descriptor {
        public Descriptor() {
            super(
                    "Sample Alert Condition",
                    "https://www.graylog.org/",
                    "This is a documentation sample and never triggers."
            );
        }
    }

}

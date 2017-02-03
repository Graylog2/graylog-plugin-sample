package org.graylog.plugins.sample.decorator;

import com.google.inject.assistedinject.Assisted;

import org.graylog2.decorators.Decorator;
import org.graylog2.plugin.configuration.ConfigurationRequest;
import org.graylog2.plugin.decorators.SearchResponseDecorator;
import org.graylog2.rest.resources.search.responses.SearchResponse;

import javax.inject.Inject;

public class SampleDecorator implements SearchResponseDecorator {

    private Decorator decorator;

    @Inject
    public SampleDecorator(@Assisted Decorator decorator) {
        this.decorator = decorator;
    }

    @Override
    public SearchResponse apply(SearchResponse searchResponse) {
        return searchResponse;
    }

    public interface Factory extends SearchResponseDecorator.Factory {
        @Override
        SampleDecorator create(Decorator decorator);

        @Override
        SampleDecorator.Config getConfig();

        @Override
        SampleDecorator.Descriptor getDescriptor();
    }

    public static class Config implements SearchResponseDecorator.Config {

        @Override
        public ConfigurationRequest getRequestedConfiguration() {
            return new ConfigurationRequest();
        }
    }

    public static class Descriptor extends SearchResponseDecorator.Descriptor {
        public Descriptor() {
            super("Sample decorator", "http://docs.graylog.org/", "Sample Decorator");
        }
    }
}

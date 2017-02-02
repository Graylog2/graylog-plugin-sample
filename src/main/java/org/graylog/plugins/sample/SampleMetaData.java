package org.graylog.plugins.sample;

import org.graylog2.plugin.PluginMetaData;
import org.graylog2.plugin.ServerStatus;
import org.graylog2.plugin.Version;

import java.net.URI;
import java.util.Collections;
import java.util.Set;

/**
 * Implement the PluginMetaData interface here.
 */
public class SampleMetaData implements PluginMetaData {
    private static final String PLUGIN_PROPERTIES = "org.graylog.plugins.graylog-plugin-sample/graylog-plugin.properties";

    @Override
    public String getUniqueId() {
        return "org.graylog.plugins.sample.SamplePlugin";
    }

    @Override
    public String getName() {
        return "Sample";
    }

    @Override
    public String getAuthor() {
        return "Graylog, Inc <hello@graylog.com>";
    }

    @Override
    public URI getURL() {
        return URI.create("https://github.com/Graylog2/graylog-plugin-sample");
    }

    @Override
    public Version getVersion() {
        return Version.fromPluginProperties(getClass(), PLUGIN_PROPERTIES, "version", Version.from(0, 0, 0, "unknown"));
    }

    @Override
    public String getDescription() {
        // TODO Insert correct plugin description
        return "Description of Sample plugin";
    }

    @Override
    public Version getRequiredVersion() {
        return Version.fromPluginProperties(getClass(), PLUGIN_PROPERTIES, "graylog.version", Version.from(0, 0, 0, "unknown"));
    }

    @Override
    public Set<ServerStatus.Capability> getRequiredCapabilities() {
        return Collections.emptySet();
    }
}

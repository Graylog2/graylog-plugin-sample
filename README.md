# Sample Plugin for Graylog

This repository is intended to be used to follow the [Plugin API documentation](https://go2docs.graylog.org/5-1/what_more_can_graylog_do_for_me/plugins.html) for Graylog.
It contains no useful functionality beyond illustrating the various extension points one can use for customizing and extending Graylog. 

__Important: Do not use this repository as a boilerplate for a new graylog plugin.\
Please use the maven archetype to create a plugin skeleton, as [described in the Plugin API documentation](https://go2docs.graylog.org/5-1/what_more_can_graylog_do_for_me/plugins.html#WritingPlugins).__


[![Build Status](https://travis-ci.org/Graylog2/graylog-plugin-sample.svg?branch=master)](https://travis-ci.org/Graylog2/graylog-plugin-sample)

__Use this paragraph to enter a description of your plugin.__

**Required Graylog version:** 5.1 and later

Installation
------------

[Download the plugin](https://github.com/Graylog2/graylog-plugin-sample/releases)
and place the `.jar` file in your Graylog plugin directory. The plugin directory
is the `plugins/` folder relative from your `graylog-server` directory by default
and can be configured in your `graylog.conf` file.

Restart `graylog-server` and you are done.

Development
-----------

You can improve your development experience for the web interface part of your plugin
dramatically by making use of hot reloading. To do this, do the following:

* `git clone https://github.com/Graylog2/graylog2-server.git`
* `cd graylog2-server/graylog2-web-interface`
* `ln -s $YOURPLUGIN plugin/`
* `npm install && npm start`

Usage
-----

__Use this paragraph to document the usage of your plugin__


Getting started
---------------

This project is using Maven 3 and requires Java 7 or higher.

* Clone this repository.
* Run `mvn package` to build a JAR file.
* Optional: Run `mvn jdeb:jdeb` and `mvn rpm:rpm` to create a DEB and RPM package respectively.
* Copy generated JAR file in target directory to your Graylog plugin directory.
* Restart the Graylog.

Plugin Release
--------------

We are using the maven release plugin:

```
$ mvn release:prepare
[...]
$ mvn release:perform
```

This sets the version numbers, creates a tag and pushes to GitHub. Travis CI will build the release artifacts and upload to GitHub automatically.

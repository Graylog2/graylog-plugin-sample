import packageJson from '../../package.json';
import { PluginManifest, PluginStore } from 'graylog-web-plugin/plugin';

import SamplePage from 'pages/SamplePage';

PluginStore.register(new PluginManifest(packageJson, {
  /* This is the place where you define which entities you are providing to the web interface.
     Right now you can add routes and navigation elements to it.

     Examples: */

  // Adding a route to /sample, rendering YourReactComponent when called:

  routes: [
    { path: '/sample', component: SamplePage },
  ],

  // Adding an element to the top navigation pointing to /sample named "Sample":

  navigation: [
    { path: '/sample', description: 'Sample' },
  ],
  
  systemnavigation: [
    { path: '/sample', description: 'Sample' },
  ]
}));

/**
 * @format
 */

import { AppRegistry } from 'react-native';
import App from './App';
import MainScreen from "./src/screen/MainScreen";
import { name as appName } from './app.json';
import registerScreens from "./src/config/navigator";
import { Navigation } from 'react-native-navigation';

registerScreens()
Navigation.events().registerAppLaunchedListener(() => {
  Navigation.setRoot({
    root: {
      component: {
        name: "main"
      }
    }
  });
});
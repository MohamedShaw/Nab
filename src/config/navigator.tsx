import {Navigation} from 'react-native-navigation';
import MainScreen from "../screen/MainScreen";
const registerScreens = () => {
    Navigation.registerComponent('main', () => MainScreen);
}

export default registerScreens;
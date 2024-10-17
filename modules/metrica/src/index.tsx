import {NativeModules} from 'react-native';

// const LINKING_ERROR =
//   `The package 'react-native-metrica' doesn't seem to be linked. Make sure: \n\n` +
//   Platform.select({ ios: "- You have run 'pod install'\n", default: '' }) +
//   '- You rebuilt the app after installing the package\n' +
//   '- You are not using Expo Go\n';

const {Metrica} = NativeModules;

export function activate(apiKey: string) {
  Metrica.activate(apiKey);
}

export function reportEvent(eventName: string, params: Object | null = null) {
  Metrica.reportEvent(eventName, params);
}

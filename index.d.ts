declare module "react-native-brutalism" {
  import React from "react";
  import ReactNative from "react-native";

  export interface PressableProps extends ReactNative.ViewProps {
    x?: number;
    y?: number;
  }

  export interface ViewProps extends ReactNative.ViewProps {
    x?: number;
    y?: number;
  }

  export class BrutalismPressable extends React.Component<PressableProps> {}
  export class BrutalismView extends React.Component<ViewProps> {}
}

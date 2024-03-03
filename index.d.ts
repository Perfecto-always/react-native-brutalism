declare module "react-native-brutalism" {
  import React from "react";
  import ReactNative from "react-native";

  export interface PressableProps extends ReactNative.ViewProps {
    x?: number;
    y?: number;
  }

  export interface ViewProps extends ReactNative.ViewProps {
    /**@default 10 */
    x?: number;
    /**@default 10 */
    y?: number;
    roundness?: number;
    /**@default "#ffffff" */
    bgColor?: string;
    /**@default 3 */
    viewBorderWidth?: number;
  }

  export class BrutalismPressable extends React.Component<PressableProps> {}
  export class BrutalismView extends React.Component<ViewProps> {}
}

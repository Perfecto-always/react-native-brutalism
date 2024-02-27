import type { HostComponent, ViewProps } from "react-native";
import { Int32 } from "react-native/Libraries/Types/CodegenTypes";
import codegenNativeComponent from "react-native/Libraries/Utilities/codegenNativeComponent";

export interface PressableProps extends ViewProps {
  x?: Int32;
  y?: Int32;
  // add other props here
}

export default codegenNativeComponent<PressableProps>(
  "RNBrutalismPressable"
) as HostComponent<PressableProps>;

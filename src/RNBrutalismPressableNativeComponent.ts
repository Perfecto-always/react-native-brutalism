import type { HostComponent, ViewProps } from "react-native";
import { Int32 } from "react-native/Libraries/Types/CodegenTypes";
import codegenNativeComponent from "react-native/Libraries/Utilities/codegenNativeComponent";

export interface NativeProps extends ViewProps {
  x?: Int32;
  y?: Int32;
  // add other props here
}

export default codegenNativeComponent<NativeProps>(
  "RNBrutalismPressable"
) as HostComponent<NativeProps>;

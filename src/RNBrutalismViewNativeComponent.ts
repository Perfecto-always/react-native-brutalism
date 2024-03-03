import type { ViewProps } from "react-native/Libraries/Components/View/ViewPropTypes";
import type { HostComponent } from "react-native";
import codegenNativeComponent from "react-native/Libraries/Utilities/codegenNativeComponent";
import { Int32 } from "react-native/Libraries/Types/CodegenTypes";

export interface NativeProps extends ViewProps {
  x?: Int32;
  y?: Int32;
  roundness?: Int32;
  bgColor: string;
  viewBorderWidth?: Int32;
}

export default codegenNativeComponent<NativeProps>(
  "RNBrutalismView"
) as HostComponent<NativeProps>;

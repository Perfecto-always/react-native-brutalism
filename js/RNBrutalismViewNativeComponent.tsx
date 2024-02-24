import type {ViewProps} from 'react-native/Libraries/Components/View/ViewPropTypes';
import type {HostComponent} from 'react-native';
import codegenNativeComponent from 'react-native/Libraries/Utilities/codegenNativeComponent';

export interface NativeProps extends ViewProps {
  x?: number;
  y?: number;
  // add other props here
}

export default codegenNativeComponent<NativeProps>(
  'RNBrutalismView',
) as HostComponent<NativeProps>;
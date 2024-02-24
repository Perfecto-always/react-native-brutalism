import type {PressableProps} from 'react-native/Libraries/Components/Pressable/Pressable';
import type {HostComponent} from 'react-native';
import codegenNativeComponent from 'react-native/Libraries/Utilities/codegenNativeComponent';

export interface NativeProps extends PressableProps {
  x?: number;
  y?: number;
  // add other props here
}

export default codegenNativeComponent<NativeProps>(
  'RNBrutalismPressable',
) as HostComponent<NativeProps>;
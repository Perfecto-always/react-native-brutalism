### Whats react-native-brutalism?
Its a lib that enables brutalism-esque styling natively for android using react-native.
### How to use?
```ts
import { BrutalismView } from "react-native-brutalism";

function App(): React.JSX.Element {
  return (
    <View style={styles.container}>
      <Text>React Native Brutalism Example</Text>
      <BrutalismView
        bgColor="#f0f0ff"
        style={{ width: 200, height: 200, padding: 10 }}
      >
        <Text>Hi,👋</Text>
      </BrutalismView>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: "center",
    alignItems: "center",
  },
});
```
### Methods available to modify 
`BrutalismView` extends View from ReactNative hence have all the properties that a normal view would have.
Alongside there are certain methods available to you which you can use to modify the view.
- `x`: Changes the position of the shadow w.r.t. x-axis (defaults to 10).
- `y`: Changes the position of the shadow w.r.t. y-axis (defaults to 10).
-  `roundness`: Changes the corner styling.
-  `bgColor`: Adjust the background color (defaults to white).
-  `viewBorderWidth`: Adds a border to the view (default value 3).

### Whats in the future?
- [ ] Create a Pressable Brutalism Button
- [ ] Adding Animations (?)
- [ ] Support iOS (shadow options are much more granular, hence could be used to create brutalism component easily)

### Contributing
I don't have any experience so feel free to steer me the right way.

/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 */

import React from "react";
import { StyleSheet, Text, View } from "react-native";

import { BrutalismView } from "react-native-brutalism";

function App(): React.JSX.Element {
  return (
    <View style={styles.container}>
      <Text>Hello</Text>
      <BrutalismView
        bgColor="#f0f0ff"
        style={{ width: 200, height: 200, padding: 10 }}
      >
        <Text>Hi</Text>
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

export default App;

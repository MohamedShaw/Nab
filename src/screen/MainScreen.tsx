import React, { Component } from 'react'
import { View, Text } from "react-native";
import { observer } from "mobx-react";
import { Controlers } from "../api/Controlers";
@observer
export default class Main extends Component {
    componentDidMount(){
        Controlers.Categories.get(0)
    }
    render() {
        return (
            <View style={{
                alignContent: 'center',
                alignSelf: 'stretch',
                flex: 1,
                alignItems: 'center',
                justifyContent: 'center'
            }}>
                <Text> Hello To type Script</Text>
            </View>

        )
    }
}
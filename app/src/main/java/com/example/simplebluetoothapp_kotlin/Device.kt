package com.example.simplebluetoothapp_kotlin

class Device(var name: String?, var addressMAC: String?) {
    @JvmName("getName1")
    fun getName(): String? {
        return name
    }

    fun getAddressMAC(): Any? {
        return addressMAC
    }
}

# Undefined Remapper [![](https://dcbadge.limes.pink/api/server/https://discord.gg/NtWa9e3vv3?style=flat)](https://discord.gg/NtWa9e3vv3)

This gradle plugin is made to be able to remap you NMS project to a different mappings. This is mainly used for mojang remapped to spigot mapped

## Imports
To import the remapped you will need to add this to your build.gradle.kts
```
id("com.undefinedcreation.mapper") version "0.0.2"
```

## Setup
The base setup of the plugin is very easy (See below).
```
remap {
   # Your minecraft version
   mcVersion.set("1.21")
}
```

## Configuration
There are multiple configurations that you can use (See below).
```
 remap {
    // This sets the minecraft version
    mcVersion.set("1.21")

    // This sets the input task it will remap
    // Default : jar
    inputTask.set("shadowJar")
        
    // This sets the remap type
    // Default : MOJANG_TO_SPIGOT
    action.set(RemapTask.Action.MOJANG_TO_SPIGOT)
    
    // If this is set to true it will create a new file with the remap else it will override the default file
    // Default : false
    createNewJar.set(true)
    
}
```

## Multi Module
Using this in a multi module setup is very simple make sure that the module using the mapper has the plugin installed and the correct version selected. Then in your main build.gradle.kts add you standard implementation of the module.

## Questions
If you have any questions or need help using this plugin please join the [discord server](https://discord.gg/NtWa9e3vv3)

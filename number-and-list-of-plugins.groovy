def plugins = Jenkins.instance.pluginManager.plugins
println "Total number of installed plugins: ${plugins.size()}\n"
println "List of installed plugins:"
plugins.each {
    println "- ${it.getShortName()} (${it.getVersion()})"
}

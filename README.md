# CloudBees CI  Plugin Inventory Script

This script allows you to retrieve the **total number of installed plugins** and the **full list of plugins (with versions)** on a Jenkins controller.

It is useful for administrators or users responsible for individual Jenkins controllers to share plugin information, especially in environments with multiple Jenkins instances (e.g. multi-controller setups).

## 🧾 What the Script Does

- Counts how many plugins are installed on the Jenkins instance
- Prints the list of all plugins with their name and version

## 💻 How to Use It

1. Log into your Jenkins instance
2. Go to: `Manage Jenkins` > `Script Console` (https://<controllerjenkinsurl>/script)
3. Copy and paste the script below into the console:
   ```groovy
   def plugins = Jenkins.instance.pluginManager.plugins
   println "Total number of installed plugins: ${plugins.size()}\n"
   println "List of installed plugins:"
   plugins.each {
       println "- ${it.getShortName()} (${it.getVersion()})"
   }
4. Run the script
5. Copy the output and share it with the requester (e.g. central administrator)

## 📌 Sample Output
 ```
Total number of installed plugins: 75

List of installed plugins:
- git (4.12.0)
- workflow-aggregator (2.6)
- matrix-auth (3.1)
- credentials (2.6.1)
...
 ```

## 📬 Why This is Needed

In distributed Jenkins environments, plugin consistency and visibility are key to:

- Ensuring compatibility across pipelines

- Avoiding version conflicts

- Keeping security patches up to date


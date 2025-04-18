# CloudBees CI Plugin & User Management Scripts
This repository contains useful scripts to extract administrative information from your Jenkins controllers.

## Available Scripts

### 1️⃣ Plugin Inventory (number-and-list-of-plugins.groovy)
This script allows you to retrieve the **total number of installed plugins** and the **full list of plugins (with versions)** on a Jenkins controller.

#### 🧾 What the Script Does
- Counts how many plugins are installed on the Jenkins instance
- Prints the list of all plugins with their name and version

#### 💻 How to Use It
1. Log into your Jenkins instance
2. Go to: `Manage Jenkins` > `Script Console` or go directly to https://your-jenkins-controller-url/script
3. Copy and paste the script below into the console:
   ```groovy
   def plugins = Jenkins.instance.pluginManager.plugins
   println "Total number of installed plugins: ${plugins.size()}\n"
   println "List of installed plugins:"
   plugins.each {
       println "- ${it.getShortName()} (${it.getVersion()})"
   }
   ```
4. Run the script
5. Copy the output and share it with the requester (e.g. central administrator)

#### 📌 Sample Output
```
Total number of installed plugins: 75
List of installed plugins:
- git (4.12.0)
- workflow-aggregator (2.6)
- matrix-auth (3.1)
- credentials (2.6.1)
...
```

### 2️⃣ User Count (number-of-users.groovy)
This script allows you to retrieve the **total number of users** registered on your Jenkins controller.

#### 🧾 What the Script Does
- Counts the total number of users in the Jenkins system

#### 💻 How to Use It
1. Log into your Jenkins instance
2. Go to: `Manage Jenkins` > `Script Console` or go directly to https://your-jenkins-controller-url/script
3. Copy and paste the script below into the console:
   ```groovy
   import jenkins.model.*
   import hudson.security.*
   def users = hudson.model.User.getAll()
   println "Total number of users: ${users.size()}"
   ```
4. Run the script
5. The output will display the total number of registered users

#### 📌 Sample Output
```
Total number of users: 42
```

## 📬 Why These Scripts Are Needed
In distributed Jenkins environments, visibility and consistency are key to:
- Ensuring compatibility across pipelines
- Avoiding version conflicts
- Keeping security patches up to date
- Monitoring system usage and access

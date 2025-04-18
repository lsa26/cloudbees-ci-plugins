import jenkins.model.*
import hudson.security.*

def users = hudson.model.User.getAll()
println "Number of users : ${users.size()}"

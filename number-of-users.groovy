import jenkins.model.*
import hudson.security.*

def users = hudson.model.User.getAll()
println "Nombre total d'utilisateurs : ${users.size()}"

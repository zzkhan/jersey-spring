require 'rake'

$jetty_target_dir='jetty'
$tomcat_target_dir='tomcat'
$current_dir=Dir.pwd()

task :build_and_deploy do
  puts "****** starting build and deploy... ******"
  stop_jetty
  build_deployables
  copy_deployables_to_jetty
  start_jetty
  puts "****** build and deploy is complete. ******"
end

task :build_and_deploy_tomcat do
  puts "****** starting build and deploy to tomcat... ******"
  stop_tomcat
  build_deployables
  copy_deployables_to_tomcat
  start_tomcat
  puts "****** build and deploy is complete. ******"
end

def build_deployables
  puts "****** building... ******"
  sh "gradle clean build"
  puts "****** done ******"
end

def copy_deployables_to_jetty
  puts "****** copying deployables to #{$jetty_target_dir}/webapps ******"
  if File.exists?(File.join($current_dir,'build/libs','jersey-spring.war'))
    FileUtils.cp(File.join($current_dir,'build/libs','jersey-spring.war'),"#{$jetty_target_dir}/webapps")
  end
  puts "****** done ******"
end

def stop_jetty
  puts "****** stopping jetty ******"
  Dir.chdir($jetty_target_dir)
  sh "./bin/jetty.sh stop"
  Dir.chdir($current_dir)
  puts "****** done ******"
end

def start_jetty
  puts "****** starting jetty ******"
  Dir.chdir($jetty_target_dir)
  sh "nohup ./bin/jetty.sh start"
  Dir.chdir($current_dir)
  puts "****** done ******"
end

def copy_deployables_to_tomcat
  puts "****** copying deployables to #{$tomcat_target_dir}/webapps ******"
  if File.exists?(File.join($current_dir,'build/libs','jersey-spring.war'))
    FileUtils.cp(File.join($current_dir,'build/libs','jersey-spring.war'),"#{$tomcat_target_dir}/webapps")
  end
  puts "****** done ******"
end

def stop_tomcat
  puts "****** stopping tomcat ******"
  Dir.chdir($tomcat_target_dir)
  sh "./bin/shutdown.sh"
  Dir.chdir($current_dir)
  puts "****** done ******"
end

def start_tomcat
  puts "****** starting tomcat ******"
  Dir.chdir($tomcat_target_dir)
  sh "nohup ./bin/startup.sh"
  Dir.chdir($current_dir)
  puts "****** done ******"
end

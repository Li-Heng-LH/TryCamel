# Chapter 1: File Copier

##### Objective #####
* Read files from one directory (data/inbox), process them in some way, and write the result to another directory (data/outbox).   
* To demonstrate Camel's routing of files. 
&nbsp;

##### Plain Java approach #####
* Make use of Java Files IO
* This approach uses low-level file API
* Need to ensure files are closed properly, which can easily go wrong 
* Much more complicated if need to set up timer or to keep track which files have been copied

##### Camel approach #####




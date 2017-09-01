This is the Taitl minimal/seed open source project.

It helps you to jump-start development of our open source projects/libraries.

To start a new project:
1. Copy this project's dir to new location, rename to to match new project's name

Remove the following (possibly hidden) files:
.svn
.classpath
.project

2. Edit pom.xml to match new project's name
3. Import in Eclipse as Maven project
4. The project should build without errors. Check Eclipse's Problems window.
5. The project must also build as Maven: Context Menu/Run As.../Maven build/Goals: clean install
6. Rename the package com.taitl.my_project_name into com.taitl.[project]
	Tip: In Eclipse, use Context Menu/Refactor/Rename...
7. Activate Checkstyle
	In Eclipse, use 
		Context Menu/Checkstyle/Activate Checkstyle 
		Context Menu/Checkstyle/Check code with Checkstyle
	This will highlight all places in the code that need attention
	with Checkstyle yellow background, and Problems view with Checkstyle diagnostics. 
	Try to fix all yellow in the code!

Now that you have a project that builds...
8. Edit/customize it according to your needs!

Enjoy!
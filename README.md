This application is designed to show possible ways to display a specific list of entities on the screen in different cases. 

For displaying custom lookup screen you can:
- Implement an additional screen and add some logic to the controller or descriptor.
- Implement [screenConfigurer](https://docs.jmix.io/jmix/backoffice-ui/actions/standard-actions/add-action.html#_screenconfigurer) or [screenOptionsSupplier](https://docs.jmix.io/jmix/backoffice-ui/actions/standard-actions/add-action.html#_screenoptionssupplier). Add some logic of displaying to the screen by declaring functions

Case 1 is present in the Active task browser, placed in the path `../screen/task/active-task-browser.xml`. "Where" condition was implemented to filter only active tasks. This screen uses in the worker editing screen. 

Case 2 is present in the task edit screen, placed in the path `../screen/task/TaskEdit.java`.
Screen displaying was configured by using function limitTaskCount in the screenConfigurer
```
@Install(to = "workersTable.add", subject = "screenConfigurer")
private void workersTableAddScreenConfigurer(Screen screen) {
((WorkerBrowse) screen).limitTaskCount(4);
}
```
Worker that have more than task limit count (parameter of the limitTaskCount function) will not be displayed on the WorkerBrowser screen (if this screen was opened via TaskEdit). 
In this case: We can't add worker to the task, if the worker has more than 4 tasks.

A limitTaskCount function is implemented in the worker browser, placed in the path `../screen/worker/WorkerBrowse.java`.

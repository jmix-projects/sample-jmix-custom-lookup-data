This application is designed to show possible ways to display a specific list of entities on the screen in different cases. 

For displaying custom lookup screen you can:
- Implement an additional screen and add some logic to the controller or descriptor.
- Implement [screenConfigurer](https://docs.jmix.io/jmix/backoffice-ui/actions/standard-actions/add-action.html#_screenconfigurer) or [screenOptionsSupplier](https://docs.jmix.io/jmix/backoffice-ui/actions/standard-actions/add-action.html#_screenoptionssupplier). Add some logic of displaying to the screen by declaring functions

Case 1 is present in the Active task browser. This screen uses in the worker editing screen. 

Case 2 is present in the task edit screen. A simple display function is implemented in the worker browser.

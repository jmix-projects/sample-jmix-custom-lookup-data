package com.company.samplejmixcustomlookupdata.screen.task;

import io.jmix.ui.screen.*;
import com.company.samplejmixcustomlookupdata.entity.Task;

@UiController("Task_.browse")
@UiDescriptor("task-browse.xml")
@LookupComponent("tasksTable")
public class TaskBrowse extends StandardLookup<Task> {
}
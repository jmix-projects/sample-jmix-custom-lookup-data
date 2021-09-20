package com.company.samplejmixcustomlookupdata.screen.task;

import io.jmix.ui.screen.*;
import com.company.samplejmixcustomlookupdata.entity.Task;

@UiController("ActiveTask.browse")
@UiDescriptor("active-task-browse.xml")
@LookupComponent("tasksTable")
public class ActiveTaskBrowse extends StandardLookup<Task> {

}
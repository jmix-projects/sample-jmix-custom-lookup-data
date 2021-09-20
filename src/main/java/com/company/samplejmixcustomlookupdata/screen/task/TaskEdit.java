package com.company.samplejmixcustomlookupdata.screen.task;

import com.company.samplejmixcustomlookupdata.entity.*;
import com.company.samplejmixcustomlookupdata.screen.worker.WorkerBrowse;
import io.jmix.ui.Notifications;
import io.jmix.ui.screen.*;
import org.springframework.beans.factory.annotation.Autowired;


@UiController("Task_.edit")
@UiDescriptor("task-edit.xml")
@EditedEntityContainer("taskDc")
public class TaskEdit extends StandardEditor<Task> {

    @Autowired
    private Notifications notifications;


    @Install(to = "workersTable.add", subject = "screenConfigurer")
    private void workersTableAddScreenConfigurer(Screen screen) {
        ((WorkerBrowse) screen).limitTaskCount(4);
    }
}
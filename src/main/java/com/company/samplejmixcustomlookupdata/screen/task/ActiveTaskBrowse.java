package com.company.samplejmixcustomlookupdata.screen.task;

import com.company.samplejmixcustomlookupdata.entity.Status;
import io.jmix.ui.model.CollectionContainer;
import io.jmix.ui.model.CollectionLoader;
import io.jmix.ui.screen.*;
import com.company.samplejmixcustomlookupdata.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@UiController("ActiveTask.browse")
@UiDescriptor("active-task-browse.xml")
@LookupComponent("tasksTable")
public class ActiveTaskBrowse extends StandardLookup<Task> {
    @Autowired
    private CollectionContainer<Task> tasksDc;

    @Subscribe(id = "tasksDl", target = Target.DATA_LOADER)
    public void onTasksDlPostLoad(CollectionLoader.PostLoadEvent<Task> event) {
        List<Task> tasks = tasksDc.getMutableItems();
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            if (task.getStatus() == null || task.getStatus().equals(Status.INACTIVE))
            {
                tasks.remove(i);
                i--;
            }

        }
    }

}
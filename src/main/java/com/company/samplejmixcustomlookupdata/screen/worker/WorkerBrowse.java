package com.company.samplejmixcustomlookupdata.screen.worker;

import io.jmix.ui.component.GroupTable;
import io.jmix.ui.model.CollectionContainer;
import io.jmix.ui.model.CollectionLoader;
import io.jmix.ui.screen.*;
import com.company.samplejmixcustomlookupdata.entity.Worker;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@UiController("Worker.browse")
@UiDescriptor("worker-browse.xml")
@LookupComponent("workersTable")
public class WorkerBrowse extends StandardLookup<Worker> {
    private int limitTasks = 0;

    @Autowired
    private CollectionContainer<Worker> workersDc;
    @Autowired
    private GroupTable<Worker> workersTable;

    public void limitTaskCount(int limitTasks) {
        this.limitTasks = limitTasks;
    }

    @Subscribe(id = "workersDl", target = Target.DATA_LOADER)
    public void onWorkersDlPostLoad(CollectionLoader.PostLoadEvent<Worker> event) {
        if (limitTasks != 0) {
            List<Worker> workers = workersDc.getMutableItems();
            for (int i = 0; i < workers.size(); i++) {
                if (workers.get(i).getTasks().size() > limitTasks)
                    workers.remove(i);
            }
        }
    }
}
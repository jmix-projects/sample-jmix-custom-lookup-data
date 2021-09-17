package com.company.samplejmixcustomlookupdata.screen.worker;

import com.company.samplejmixcustomlookupdata.entity.Status;
import com.company.samplejmixcustomlookupdata.entity.Task;
import io.jmix.ui.action.Action;
import io.jmix.ui.component.Button;
import io.jmix.ui.model.CollectionContainer;
import io.jmix.ui.model.CollectionPropertyContainer;
import io.jmix.ui.model.InstanceContainer;
import io.jmix.ui.model.InstanceLoader;
import io.jmix.ui.screen.*;
import com.company.samplejmixcustomlookupdata.entity.Worker;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@UiController("Worker.edit")
@UiDescriptor("worker-edit.xml")
@EditedEntityContainer("workerDc")
public class WorkerEdit extends StandardEditor<Worker> {

}
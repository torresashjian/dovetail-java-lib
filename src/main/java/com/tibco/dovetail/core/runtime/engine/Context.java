package com.tibco.dovetail.core.runtime.engine;

import com.tibco.dovetail.core.runtime.flow.ReplyHandler;
import com.tibco.dovetail.core.runtime.services.IContainerService;

import java.util.HashMap;
import java.util.Map;

abstract public class Context {
    protected Map<String, Object> inputs = new HashMap<>();
    private Map<String, Object> outputs = new HashMap<>();
    protected IContainerService containerService;
    protected ReplyHandler reply;

    public Object getInput(String param) {
        return inputs.get(param);
    }

    public Map<String, Object> getInputs() {
        return this.inputs;
    }

    public Object getOutput(String param) {
        return outputs.get(param);
    }

    public Map<String, Object> getOutputs() {
        return this.outputs;
    }

    public void setOutput(String param, Object value) {
        outputs.put(param, value);
    }

    public IContainerService getContainerService() {
        return containerService;
    }
    
    public ReplyHandler getReplyHandler() {
    		return this.reply;
    }
}
package com.github.enbyex.nbx.studio.api;

/**
 * @author soniex2
 */
public interface IStudioAdapter {
    IEventAdapter getEventAdapter();

    IOptionsAdapter getOptionsAdapter();

    IWindowAdapter getWindowAdapter();

    ISoundAdapter getSoundAdapter();
}

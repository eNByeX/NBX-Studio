package com.github.enbyex.nbx.studio;

import com.github.enbyex.nbx.studio.api.IStudioAdapter;

/**
 * @author soniex2
 */
public class NBXStudio {
    private IStudioAdapter adapter;

    public NBXStudio(IStudioAdapter adapter) {
        this.adapter = adapter;
    }

    public IStudioAdapter getAdapter() {
        return adapter;
    }
}

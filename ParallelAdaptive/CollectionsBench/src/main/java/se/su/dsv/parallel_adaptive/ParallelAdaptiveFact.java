package se.su.dsv.parallel_adaptive;

import java.util.function.Supplier;
import se.su.dsv.parallel_adaptive.SavvasLogAdaptiveV2NoListLog;


public enum ParallelAdaptiveFact {

    PARALLEL_ADAPTIVE_LIST(() ->
            new se.su.dsv.parallel_adaptive.SavvasLogAdaptiveV2NoListLog(SavvasLogAdaptiveV2NoListLog.State.LIST)),
    PARALLEL_ADAPTIVE_MAP(() ->
            new se.su.dsv.parallel_adaptive.SavvasLogAdaptiveV2NoListLog(SavvasLogAdaptiveV2NoListLog.State.MAP)),
    WRAPPED_MAP(() ->
            new se.su.dsv.parallel_adaptive.SavvasLogAdaptiveV2NoListLog(SavvasLogAdaptiveV2NoListLog.State.MAP, false)),
    WRAPPED_LIST(() ->
            new se.su.dsv.parallel_adaptive.SavvasLogAdaptiveV2NoListLog(SavvasLogAdaptiveV2NoListLog.State.LIST, false));


    public final Supplier<SavvasLogAdaptiveV2NoListLog<Object>> maker;

    private ParallelAdaptiveFact(Supplier<SavvasLogAdaptiveV2NoListLog<Object>> maker) {
        this.maker = maker;
    }
}

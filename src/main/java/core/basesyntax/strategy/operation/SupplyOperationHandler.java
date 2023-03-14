package core.basesyntax.strategy.operation;

import core.basesyntax.db.Storage;
import core.basesyntax.model.FruitTransaction;

public class SupplyOperationHandler implements OperationHandler {
    @Override
    public void action(FruitTransaction fruitTransaction) {
        Storage.add(fruitTransaction.getFruit(), fruitTransaction.getQuantity());
    }
}
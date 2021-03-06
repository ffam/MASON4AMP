/* Generated By:JJTree: Do not edit this line. QTInput.java */

package org.ascape.query.parser;

import org.ascape.query.Validated;

public class QTInput extends SimpleNode implements Validated {
    public QTInput(int id) {
        super(id);
    }

    public QTInput(BoolExprTree p, int id) {
        super(p, id);
    }


    public void validate(Object object) throws ParseException {
        validateChildren(object, this);
    }

    public void validateChildren(Object object, Node node) throws ParseException {
        for (int i = 0; i < node.jjtGetNumChildren(); i++) {
            Node child = node.jjtGetChild(i);
            if (child != null) {
                if (child instanceof Validated) {
                    ((Validated) child).validate(object);
                }
                validateChildren(object, child);
            }
        }
    }
}

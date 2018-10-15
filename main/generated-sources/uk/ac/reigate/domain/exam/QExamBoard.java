package uk.ac.reigate.domain.exam;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QExamBoard is a Querydsl query type for ExamBoard
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QExamBoard extends EntityPathBase<ExamBoard> {

    private static final long serialVersionUID = 2049554689L;

    public static final QExamBoard examBoard = new QExamBoard("examBoard");

    public final uk.ac.reigate.domain.QNamedEntityNoIdentity _super = new uk.ac.reigate.domain.QNamedEntityNoIdentity(this);

    public final StringPath boardCentreNumber = createString("boardCentreNumber");

    public final StringPath boardCode = createString("boardCode");

    public final StringPath boardIdentifier = createString("boardIdentifier");

    //inherited
    public final StringPath description = _super.description;

    //inherited
    public final NumberPath<Integer> id = _super.id;

    //inherited
    public final SimplePath<groovy.lang.MetaClass> metaClass = _super.metaClass;

    //inherited
    public final StringPath name = _super.name;

    public final StringPath telephoneNo = createString("telephoneNo");

    public QExamBoard(String variable) {
        super(ExamBoard.class, forVariable(variable));
    }

    public QExamBoard(Path<? extends ExamBoard> path) {
        super(path.getType(), path.getMetadata());
    }

    public QExamBoard(PathMetadata metadata) {
        super(ExamBoard.class, metadata);
    }

}


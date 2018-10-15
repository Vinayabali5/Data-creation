package uk.ac.reigate.domain.exam;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCandidate is a Querydsl query type for Candidate
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCandidate extends EntityPathBase<Candidate> {

    private static final long serialVersionUID = -1629762435L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCandidate candidate = new QCandidate("candidate");

    public final uk.ac.reigate.domain.QBaseEntity _super = new uk.ac.reigate.domain.QBaseEntity(this);

    public final NumberPath<Integer> candidateNumber = createNumber("candidateNumber", Integer.class);

    //inherited
    public final NumberPath<Integer> id = _super.id;

    //inherited
    public final SimplePath<groovy.lang.MetaClass> metaClass = _super.metaClass;

    public final uk.ac.reigate.domain.academic.QStudent student;

    public QCandidate(String variable) {
        this(Candidate.class, forVariable(variable), INITS);
    }

    public QCandidate(Path<? extends Candidate> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCandidate(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCandidate(PathMetadata metadata, PathInits inits) {
        this(Candidate.class, metadata, inits);
    }

    public QCandidate(Class<? extends Candidate> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.student = inits.isInitialized("student") ? new uk.ac.reigate.domain.academic.QStudent(forProperty("student"), inits.get("student")) : null;
    }

}


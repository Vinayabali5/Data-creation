package uk.ac.reigate.domain.ilp;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTarget is a Querydsl query type for Target
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTarget extends EntityPathBase<Target> {

    private static final long serialVersionUID = 1585562043L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTarget target1 = new QTarget("target1");

    public final uk.ac.reigate.domain.QBaseEntity _super = new uk.ac.reigate.domain.QBaseEntity(this);

    public final StringPath byWhen = createString("byWhen");

    //inherited
    public final NumberPath<Integer> id = _super.id;

    public final QILPInterview interview;

    //inherited
    public final SimplePath<groovy.lang.MetaClass> metaClass = _super.metaClass;

    public final BooleanPath sendLetter = createBoolean("sendLetter");

    public final StringPath target = createString("target");

    public QTarget(String variable) {
        this(Target.class, forVariable(variable), INITS);
    }

    public QTarget(Path<? extends Target> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTarget(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTarget(PathMetadata metadata, PathInits inits) {
        this(Target.class, metadata, inits);
    }

    public QTarget(Class<? extends Target> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.interview = inits.isInitialized("interview") ? new QILPInterview(forProperty("interview"), inits.get("interview")) : null;
    }

}


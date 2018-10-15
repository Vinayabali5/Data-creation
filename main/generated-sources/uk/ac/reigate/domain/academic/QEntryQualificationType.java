package uk.ac.reigate.domain.academic;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QEntryQualificationType is a Querydsl query type for EntryQualificationType
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEntryQualificationType extends EntityPathBase<EntryQualificationType> {

    private static final long serialVersionUID = -705475243L;

    public static final QEntryQualificationType entryQualificationType = new QEntryQualificationType("entryQualificationType");

    public final uk.ac.reigate.domain.QCodedEntity _super = new uk.ac.reigate.domain.QCodedEntity(this);

    //inherited
    public final StringPath code = _super.code;

    //inherited
    public final StringPath description = _super.description;

    //inherited
    public final NumberPath<Integer> id = _super.id;

    //inherited
    public final SimplePath<groovy.lang.MetaClass> metaClass = _super.metaClass;

    public final NumberPath<Float> size = createNumber("size", Float.class);

    public QEntryQualificationType(String variable) {
        super(EntryQualificationType.class, forVariable(variable));
    }

    public QEntryQualificationType(Path<? extends EntryQualificationType> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEntryQualificationType(PathMetadata metadata) {
        super(EntryQualificationType.class, metadata);
    }

}


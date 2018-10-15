package uk.ac.reigate.domain.exam;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QExamSeries is a Querydsl query type for ExamSeries
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QExamSeries extends EntityPathBase<ExamSeries> {

    private static final long serialVersionUID = -410355780L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QExamSeries examSeries1 = new QExamSeries("examSeries1");

    public final uk.ac.reigate.domain.academic.QAcademicYear academicYear;

    public final BooleanPath entrySubmitted = createBoolean("entrySubmitted");

    public final QExamBoard examBoard;

    public final StringPath examSeries = createString("examSeries");

    public final NumberPath<Integer> examSeriesId = createNumber("examSeriesId", Integer.class);

    public final StringPath examYear = createString("examYear");

    public final SimplePath<groovy.lang.MetaClass> metaClass = createSimple("metaClass", groovy.lang.MetaClass.class);

    public final NumberPath<Integer> nextSequenceNo = createNumber("nextSequenceNo", Integer.class);

    public QExamSeries(String variable) {
        this(ExamSeries.class, forVariable(variable), INITS);
    }

    public QExamSeries(Path<? extends ExamSeries> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QExamSeries(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QExamSeries(PathMetadata metadata, PathInits inits) {
        this(ExamSeries.class, metadata, inits);
    }

    public QExamSeries(Class<? extends ExamSeries> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.academicYear = inits.isInitialized("academicYear") ? new uk.ac.reigate.domain.academic.QAcademicYear(forProperty("academicYear")) : null;
        this.examBoard = inits.isInitialized("examBoard") ? new QExamBoard(forProperty("examBoard")) : null;
    }

}

